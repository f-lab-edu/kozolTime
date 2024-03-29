package kr.co.ky.community

import android.content.ContextWrapper
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kr.co.ky.cardviewCollection.CardviewInterface
import kr.co.ky.detail.DetailPage
import kr.co.ky.firestoreKey.FirestoreKey
import kr.co.ky.kozoltime.R
import kr.co.ky.kozoltime.databinding.OfficeCardviewBinding
import kr.co.ky.like.LikeInterface

class CommunityAdapter(var communityList:MutableList<CommunityDataClass>, val collection: String, val likeInterface: LikeInterface,val cardviewInterface: CardviewInterface): RecyclerView.Adapter<CommunityAdapter.ViewHolder>() {

    val uid = FirestoreKey.auth.currentUser?.uid
    val option = RequestOptions().error(R.drawable.ic_add_a_photo).fallback(R.drawable.ic_add_a_photo).placeholder(R.drawable.ic_add_a_photo)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = OfficeCardviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(private val binding: OfficeCardviewBinding): RecyclerView.ViewHolder(binding.root){
        val likeImage = binding.likeImage
        val cardView = binding.jobCardview
        fun bind(title:String?,id:String?,date:String?,likeCount:String?) {
            binding.cardTitle.text = title
            binding.cardId.text = id
            binding.cardDate.text = date
            binding.likeCount.text = likeCount
            Glide.with(itemView)
                .load(communityList[bindingAdapterPosition].imageUri)
                .apply(option)
                .into(binding.cardImage)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(communityList[position].title,
            communityList[position].id,
            communityList[position].singleDate,
            communityList[position].likeCount.toString())

        holder.cardView.setOnClickListener {
            when (collection) {
                "community" -> {
                    communityList[position].document?.let { it1 ->
                        cardviewInterface.selectCollection(holder.itemView.context,"community",
                            it1)
                    }
                }
                "office" -> {
                    communityList[position].document?.let { it1 ->
                        cardviewInterface.selectCollection(holder.itemView.context, "office",
                            it1)
                    }
                  }
                }
            }
            holder.likeImage.setOnClickListener {
                likeInterface.ClickLike(collection, communityList, position)
            }

            if (uid?.let { communityList[position].like?.containsKey(it) } == true) {
                holder.likeImage.setImageResource(R.drawable.ic_favorite)
            } else {
                holder.likeImage.setImageResource(R.drawable.ic_favorite_border)
            }
        }

    override fun getItemCount(): Int {
        return communityList.size
    }
}



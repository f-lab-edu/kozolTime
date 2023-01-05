// Generated by view binder compiler. Do not edit!
package kr.co.ky.kozoltime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.co.ky.kozoltime.R;

public final class WriteCommunityActivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button communityBtn;

  @NonNull
  public final EditText communitySsulContext;

  @NonNull
  public final ImageView communitySsulImage;

  @NonNull
  public final EditText communitySsulTitle;

  private WriteCommunityActivityBinding(@NonNull LinearLayout rootView,
      @NonNull Button communityBtn, @NonNull EditText communitySsulContext,
      @NonNull ImageView communitySsulImage, @NonNull EditText communitySsulTitle) {
    this.rootView = rootView;
    this.communityBtn = communityBtn;
    this.communitySsulContext = communitySsulContext;
    this.communitySsulImage = communitySsulImage;
    this.communitySsulTitle = communitySsulTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WriteCommunityActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WriteCommunityActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.write_community_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WriteCommunityActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.community_btn;
      Button communityBtn = ViewBindings.findChildViewById(rootView, id);
      if (communityBtn == null) {
        break missingId;
      }

      id = R.id.community_ssul_context;
      EditText communitySsulContext = ViewBindings.findChildViewById(rootView, id);
      if (communitySsulContext == null) {
        break missingId;
      }

      id = R.id.community_ssul_image;
      ImageView communitySsulImage = ViewBindings.findChildViewById(rootView, id);
      if (communitySsulImage == null) {
        break missingId;
      }

      id = R.id.community_ssul_title;
      EditText communitySsulTitle = ViewBindings.findChildViewById(rootView, id);
      if (communitySsulTitle == null) {
        break missingId;
      }

      return new WriteCommunityActivityBinding((LinearLayout) rootView, communityBtn,
          communitySsulContext, communitySsulImage, communitySsulTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
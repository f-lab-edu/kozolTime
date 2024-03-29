// Generated by view binder compiler. Do not edit!
package kr.co.ky.kozoltime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.co.ky.kozoltime.R;

public final class FragmentFindJobBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton fabWriteFindJob;

  @NonNull
  public final LinearLayout findJobLinear;

  @NonNull
  public final RecyclerView findJobRecyclerview;

  @NonNull
  public final Button findJobSearchButton;

  @NonNull
  public final TextView findJobText;

  private FragmentFindJobBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton fabWriteFindJob, @NonNull LinearLayout findJobLinear,
      @NonNull RecyclerView findJobRecyclerview, @NonNull Button findJobSearchButton,
      @NonNull TextView findJobText) {
    this.rootView = rootView;
    this.fabWriteFindJob = fabWriteFindJob;
    this.findJobLinear = findJobLinear;
    this.findJobRecyclerview = findJobRecyclerview;
    this.findJobSearchButton = findJobSearchButton;
    this.findJobText = findJobText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFindJobBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFindJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_find_job, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFindJobBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fabWrite_find_job;
      FloatingActionButton fabWriteFindJob = ViewBindings.findChildViewById(rootView, id);
      if (fabWriteFindJob == null) {
        break missingId;
      }

      id = R.id.find_job_linear;
      LinearLayout findJobLinear = ViewBindings.findChildViewById(rootView, id);
      if (findJobLinear == null) {
        break missingId;
      }

      id = R.id.find_job_recyclerview;
      RecyclerView findJobRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (findJobRecyclerview == null) {
        break missingId;
      }

      id = R.id.find_job_search_button;
      Button findJobSearchButton = ViewBindings.findChildViewById(rootView, id);
      if (findJobSearchButton == null) {
        break missingId;
      }

      id = R.id.find_job_text;
      TextView findJobText = ViewBindings.findChildViewById(rootView, id);
      if (findJobText == null) {
        break missingId;
      }

      return new FragmentFindJobBinding((ConstraintLayout) rootView, fabWriteFindJob, findJobLinear,
          findJobRecyclerview, findJobSearchButton, findJobText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

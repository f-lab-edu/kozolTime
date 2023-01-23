// Generated by view binder compiler. Do not edit!
package kr.co.ky.kozoltime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.co.ky.kozoltime.R;

public final class FindJobCardviewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView findJobCardviewContext;

  @NonNull
  public final TextView findJobCardviewDate;

  @NonNull
  public final LinearLayout findJobCardviewLinear;

  @NonNull
  public final TextView findJobCardviewOfficeName;

  @NonNull
  public final TextView findJobCardviewTitle;

  @NonNull
  public final CardView jobCardview;

  private FindJobCardviewBinding(@NonNull LinearLayout rootView,
      @NonNull TextView findJobCardviewContext, @NonNull TextView findJobCardviewDate,
      @NonNull LinearLayout findJobCardviewLinear, @NonNull TextView findJobCardviewOfficeName,
      @NonNull TextView findJobCardviewTitle, @NonNull CardView jobCardview) {
    this.rootView = rootView;
    this.findJobCardviewContext = findJobCardviewContext;
    this.findJobCardviewDate = findJobCardviewDate;
    this.findJobCardviewLinear = findJobCardviewLinear;
    this.findJobCardviewOfficeName = findJobCardviewOfficeName;
    this.findJobCardviewTitle = findJobCardviewTitle;
    this.jobCardview = jobCardview;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FindJobCardviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FindJobCardviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.find_job_cardview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FindJobCardviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.find_job_cardview_context;
      TextView findJobCardviewContext = ViewBindings.findChildViewById(rootView, id);
      if (findJobCardviewContext == null) {
        break missingId;
      }

      id = R.id.find_job_cardview_date;
      TextView findJobCardviewDate = ViewBindings.findChildViewById(rootView, id);
      if (findJobCardviewDate == null) {
        break missingId;
      }

      id = R.id.find_job_cardview_linear;
      LinearLayout findJobCardviewLinear = ViewBindings.findChildViewById(rootView, id);
      if (findJobCardviewLinear == null) {
        break missingId;
      }

      id = R.id.find_job_cardview_office_name;
      TextView findJobCardviewOfficeName = ViewBindings.findChildViewById(rootView, id);
      if (findJobCardviewOfficeName == null) {
        break missingId;
      }

      id = R.id.find_job_cardview_title;
      TextView findJobCardviewTitle = ViewBindings.findChildViewById(rootView, id);
      if (findJobCardviewTitle == null) {
        break missingId;
      }

      id = R.id.job_cardview;
      CardView jobCardview = ViewBindings.findChildViewById(rootView, id);
      if (jobCardview == null) {
        break missingId;
      }

      return new FindJobCardviewBinding((LinearLayout) rootView, findJobCardviewContext,
          findJobCardviewDate, findJobCardviewLinear, findJobCardviewOfficeName,
          findJobCardviewTitle, jobCardview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
package au.com.gridstone.debugdrawer

import android.app.Activity
import android.view.ViewGroup

fun getRootViewContainerFor(activity: Activity): ViewGroup {
  return activity.findViewById(android.R.id.content) as ViewGroup
}

package au.com.gridstone.debugdrawer

import android.content.res.Resources
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

internal fun Resources.dpToPx(dp: Int) = (dp * displayMetrics.density).toInt()
internal fun View.dpToPx(dp: Int): Int = resources.dpToPx(dp)

internal fun ViewGroup.inflate(layoutRes: Int, attach: Boolean = false) =
    LayoutInflater.from(context).inflate(layoutRes, this, false)

internal fun <T> SparseArray<T>.toSet(): Set<T> {
  val set = LinkedHashSet<T>(this.size())

  for (i in 0 until this.size()) {
    set.add(this.valueAt(i))
  }

  return set
}

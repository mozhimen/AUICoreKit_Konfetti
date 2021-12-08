package nl.dionsegijn.konfetti_core.models

import android.content.res.Resources

/**
 * [sizeInDp] the size of the confetti in dip
 * [mass] each size can have its own mass for slightly different behavior. For example, the closer
 * the mass is to zero the easier it will accelerate.
 */
data class Size(val sizeInDp: Int, val mass: Float = 5f) {

    internal val sizeInPx: Float
        get() = sizeInDp * Resources.getSystem().displayMetrics.density

    init {
        require(mass != 0F) { "mass=$mass must be != 0" }
    }

    companion object {
        val SMALL: Size = Size(sizeInDp = 4, mass = 4f )
        val MEDIUM: Size = Size(8)
        val LARGE: Size = Size(12, mass = 6f)
    }
}

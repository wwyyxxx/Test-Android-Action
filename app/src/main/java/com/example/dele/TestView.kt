package com.example.dele

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PixelFormat
import android.util.AttributeSet
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView

class TestView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : SurfaceView(context, attrs) ,SurfaceHolder.Callback{
    val TAG = "TestView"
    private val mSurfaceHolder: SurfaceHolder = holder
    private var mCanvas: Canvas? = null
    private val paint: Paint by lazy {
        Paint(Paint.ANTI_ALIAS_FLAG)
    }

    init {
        mSurfaceHolder.addCallback(this)
        mSurfaceHolder.setFormat(PixelFormat.TRANSPARENT)
        paint.color = Color.RED
        paint.strokeWidth = 5f
        paint.style = Paint.Style.STROKE
    }

    override fun surfaceCreated(holder: SurfaceHolder) {
        Log.d(TAG,"surfaceCreated")
        Thread(Runnable {
            draw()
        }).start()
    }

    private fun draw() {
        Log.d(TAG,"draw")
        mCanvas = mSurfaceHolder.lockCanvas();
        mCanvas?.drawCircle(500f,500f,300f,paint)
        mCanvas?.drawCircle(100f,200f,30f,paint)
        mSurfaceHolder.unlockCanvasAndPost(mCanvas)
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        Log.d(TAG,"surfaceChanged")
    }

    override fun surfaceDestroyed(holder: SurfaceHolder) {
        Log.d(TAG,"surfaceDestroyed")
    }


}
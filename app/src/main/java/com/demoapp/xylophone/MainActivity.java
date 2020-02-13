package com.demoapp.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    private final int NR_OF_SIMULTANEOUS_SOUND = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY=0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;

    private int mASoundId;
    private int mBSoundId;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);

        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);
        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
    }

    public void playA(View v)
    {
        Log.d("Sound1","is clicked");
        mSoundPool.play(mCSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playB(View v)
    {
        Log.d("Sound2","is clicked");
        mSoundPool.play(mDSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playC(View v)
    {
        Log.d("Sound3","is clicked");
        mSoundPool.play(mESoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playD(View v)
    {
        Log.d("Sound4","is clicked");
        mSoundPool.play(mFSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playE(View v)
    {
        Log.d("Sound5","is clicked");
        mSoundPool.play(mGSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playF(View v)
    {
        Log.d("Sound6","is clicked");
        mSoundPool.play(mASoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playG(View v)
    {
        Log.d("Sound7","is clicked");
        mSoundPool.play(mBSoundId,1.0f,1.0f,0,0,1.0f);
    }

}

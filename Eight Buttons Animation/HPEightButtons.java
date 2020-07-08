package com.hp.eightbutton;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
	Create By : Himanshu Prajapati
	Date : 31-05-2017
 */

public class HPEightButtons extends RelativeLayout
{
    int height = 0;
    int width = 0;
    int i = 1;

    boolean animated = false;

    int displayHeight = 0;
    int displayWidth = 0;

    int homeWidth = 0;

    View mainView,homeView,addViewOne, addViewTwo, addViewThree, addViewFour, addViewFive, addViewSix, addViewSeven, addViewEight;

    public HPEightButtons(Context context)
    {
        super(context);
        init(context);
    }

    public HPEightButtons(Context context, AttributeSet attributeSet)
    {
        super(context,attributeSet);
        init(context);
    }

    private void init(final Context context)
    {
        mainView = inflate(context, R.layout.layout_eight_circle,this);
        homeView = (ImageView) mainView.findViewById(R.id.imgHome);
        addViewOne = (ImageView) mainView.findViewById(R.id.imgAddOne);
        addViewTwo = (ImageView) mainView.findViewById(R.id.imgAddTwo);
        addViewThree = (ImageView) mainView.findViewById(R.id.imgAddThree);
        addViewFour = (ImageView) mainView.findViewById(R.id.imgAddFour);
        addViewFive = (ImageView) mainView.findViewById(R.id.imgAddFive);
        addViewSix = (ImageView) mainView.findViewById(R.id.imgAddSix);
        addViewSeven = (ImageView) mainView.findViewById(R.id.imgAddSeven);
        addViewEight = (ImageView) mainView.findViewById(R.id.imgAddEight);

        setDisplayDimen(context);

        homeWidth = displayWidth / 3;

        homeView.getLayoutParams().width = homeWidth;
        homeView.getLayoutParams().height = homeWidth;

        homeView.bringToFront();

        homeView.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Log.i("Width",""+homeWidth);

                if(animated)
                {
                    animated = false;

                    TranslateAnimation taAdd = new TranslateAnimation(0f,0f,-homeWidth,0f);
                    taAdd.setDuration(600);
                    taAdd.setFillAfter(true);
                    taAdd.setInterpolator(new BounceInterpolator());
                    addViewOne.startAnimation(taAdd);

                    TranslateAnimation taAddTwo = new TranslateAnimation(homeWidth - 50,0f,-homeWidth + 50,0f);
                    taAddTwo.setDuration(600);
                    taAddTwo.setFillAfter(true);
                    taAddTwo.setInterpolator(new BounceInterpolator());
                    addViewTwo.startAnimation(taAddTwo);

                    TranslateAnimation taAddThree = new TranslateAnimation(homeWidth,0f,0f,0f);
                    taAddThree.setDuration(600);
                    taAddThree.setFillAfter(true);
                    taAddThree.setInterpolator(new BounceInterpolator());
                    addViewThree.startAnimation(taAddThree);

                    TranslateAnimation taAddFour = new TranslateAnimation(homeWidth - 50 ,0f,homeWidth - 50,0f);
                    taAddFour.setDuration(600);
                    taAddFour.setFillAfter(true);
                    taAddFour.setInterpolator(new BounceInterpolator());
                    addViewFour.startAnimation(taAddFour);

                    TranslateAnimation taAddFive = new TranslateAnimation(0f,0f,homeWidth,0f);
                    taAddFive.setDuration(600);
                    taAddFive.setFillAfter(true);
                    taAddFive.setInterpolator(new BounceInterpolator());
                    addViewFive.startAnimation(taAddFive);

                    TranslateAnimation taAddSix = new TranslateAnimation(-homeWidth + 50 ,0f,homeWidth - 50,0f);
                    taAddSix.setDuration(600);
                    taAddSix.setFillAfter(true);
                    taAddSix.setInterpolator(new BounceInterpolator());
                    addViewSix.startAnimation(taAddSix);

                    TranslateAnimation taAddSeven = new TranslateAnimation(-homeWidth,0f,0f,0f);
                    taAddSeven.setDuration(600);
                    taAddSeven.setFillAfter(true);
                    taAddSeven.setInterpolator(new BounceInterpolator());
                    addViewSeven.startAnimation(taAddSeven);

                    TranslateAnimation taAddEight = new TranslateAnimation(-homeWidth +50 ,0f,-homeWidth + 50,0f);
                    taAddEight.setDuration(600);
                    taAddEight.setFillAfter(true);
                    taAddEight.setInterpolator(new BounceInterpolator());
                    addViewEight.startAnimation(taAddEight);

                    homeView.bringToFront();
                }
                else{
                    animated = true;

                    TranslateAnimation taAddOne = new TranslateAnimation(0f,0f,0f,-homeWidth);
                    taAddOne.setDuration(600);
                    taAddOne.setFillAfter(true);
                    taAddOne.setInterpolator(new BounceInterpolator());
                    addViewOne.startAnimation(taAddOne);

                    TranslateAnimation taAddTwo = new TranslateAnimation(0f,homeWidth - 50,0f,-homeWidth + 50);
                    taAddTwo.setDuration(600);
                    taAddTwo.setFillAfter(true);
                    taAddTwo.setInterpolator(new BounceInterpolator());
                    addViewTwo.startAnimation(taAddTwo);

                    TranslateAnimation taAddThree = new TranslateAnimation(0f,homeWidth,0f,0f);
                    taAddThree.setDuration(600);
                    taAddThree.setFillAfter(true);
                    taAddThree.setInterpolator(new BounceInterpolator());
                    addViewThree.startAnimation(taAddThree);

                    TranslateAnimation taAddFour = new TranslateAnimation(0f,homeWidth - 50,0f,homeWidth - 50);
                    taAddFour.setDuration(600);
                    taAddFour.setFillAfter(true);
                    taAddFour.setInterpolator(new BounceInterpolator());
                    addViewFour.startAnimation(taAddFour);

                    TranslateAnimation taAddFive = new TranslateAnimation(0f,0f,0f,homeWidth);
                    taAddFive.setDuration(600);
                    taAddFive.setFillAfter(true);
                    taAddFive.setInterpolator(new BounceInterpolator());
                    addViewFive.startAnimation(taAddFive);

                    TranslateAnimation taAddSix = new TranslateAnimation(0f,-homeWidth + 50 ,0f,homeWidth - 50);
                    taAddSix.setDuration(600);
                    taAddSix.setFillAfter(true);
                    taAddSix.setInterpolator(new BounceInterpolator());
                    addViewSix.startAnimation(taAddSix);

                    TranslateAnimation taAddSeven = new TranslateAnimation(0f,-homeWidth,0f,0f);
                    taAddSeven.setDuration(600);
                    taAddSeven.setFillAfter(true);
                    taAddSeven.setInterpolator(new BounceInterpolator());
                    addViewSeven.startAnimation(taAddSeven);

                    TranslateAnimation taAddEight = new TranslateAnimation(0f,-homeWidth + 50 ,0f,-homeWidth + 50);
                    taAddEight.setDuration(600);
                    taAddEight.setFillAfter(true);
                    taAddEight.setInterpolator(new BounceInterpolator());
                    addViewEight.startAnimation(taAddEight);

                }

            }
        });

    }

    private void setDisplayDimen(Context context)
    {
        DisplayMetrics dm = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(dm);
        displayHeight = dm.heightPixels;;
        displayWidth = dm.widthPixels;

        Log.i("Width Display",""+displayWidth);
    }
}

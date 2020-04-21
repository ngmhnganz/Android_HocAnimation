package com.nguyenminhngan.android_hocanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    /*
    Để mở region ctrl + shift + "+"
    Để đóng region ctrl + shift + "-"
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //region Property Animatior
    public void XuLyObjectAnimator(View view) {
        Button btnObjectAnimator = (Button) findViewById(R.id.btnObjectAnimator);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this,R.animator.object_animator);
        objectAnimator.setTarget(btnObjectAnimator);
        objectAnimator.start();
    }

    public void XuLyObjectAnimatorSet(View view) {
    Button btnObjectAnimatorSet = (Button) findViewById(R.id.btnObjectAnimatorSet);
    AnimatorSet animatorSet =  (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.object_animator_set);
    animatorSet.setTarget(btnObjectAnimatorSet);
    animatorSet.start();
    }

    //endregion

    //region View Animation
    public void xuLyAlphAnimation(View view) {
        Button btnAlpha = (Button) findViewById(R.id.btnAlpha);
        Animation alphaAnimation = (Animation) AnimationUtils.loadAnimation(this,R.anim.alpha_animation);
        btnAlpha.startAnimation(alphaAnimation);
    }

    public void xuLyScaleAnimation(View view) {
        Button btnScale = (Button) findViewById(R.id.btnScaleAnimation);
        Animation animation = (Animation) AnimationUtils.loadAnimation(this,R.anim.scale_animation);
        btnScale.startAnimation(animation);
    }

    public void xuLyTranslate(View view) {
        Button btnTranslate = (Button) findViewById(R.id.btnTranslate);
        Animation animation =(Animation) AnimationUtils.loadAnimation(this,R.anim.translate_animation);
        btnTranslate.startAnimation(animation);
    }

    public void xuLyRotate(View view) {
        Button btnRotate = (Button) findViewById(R.id.btnRotate);
        Animation animation =(Animation) AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        btnRotate.startAnimation(animation);
    }
    // ví dụ muốn chạy animation xong thì thực hiện command
    public void xuLyTongHop(View view) {
        Button btnTongHop = (Button) findViewById(R.id.btnTongHop);
        Animation animation =(Animation) AnimationUtils.loadAnimation(this,R.anim.tonghop_hieuung);
        btnTongHop.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    //endregion

    //region rung nhẹ
    public void xuLyRung(View view) {
        Button btnRung = (Button) findViewById(R.id.btnRungNhẹ);
        Animation animation = (Animation) AnimationUtils.loadAnimation(this,R.anim.laclac);
        btnRung.startAnimation(animation);
    }
    //endregion
}

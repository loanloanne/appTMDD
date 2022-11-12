package com.Nhom13.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.Nhom13.miuteaapp.R;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }
    int images[] = {
            R.drawable.logo,
            R.drawable.onboardinghai,
            R.drawable.onboardingba,

    };
    int headings[] = {
            R.string.first_slide_title,
            R.string.second_slide_title,
            R.string.third_slide_title,
    };
    int description[] ={
            R.string.first_slide_desc,
            R.string.second_slide_desc,
            R.string.third_slide_desc,
    };

    @Override
    public int getCount() {
        return headings.length;
    }



    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slides_layout, container, false);
        //Hooks
        ImageView imageView = view.findViewById(R.id.img_slider);
        TextView heading = view.findViewById(R.id.txt_sliderheading);
        TextView decs = view.findViewById(R.id.txt_sliderdescription);
        imageView.setImageResource(images[position]);
        heading.setText(headings[position]);
        decs.setText(description[position]);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

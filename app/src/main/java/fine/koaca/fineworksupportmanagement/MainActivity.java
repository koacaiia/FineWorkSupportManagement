package fine.koaca.fineworksupportmanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {
    FragmentManager fragmentManager;
    A4Fragment fragmentA4;
    StretchFilmLarge fragmentStretchL;
    StretchFilmSmall fragmentStretchS;
    FragmentTransaction transaction;
    ViewPager2 viewPager;
    FragmentStateAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();

        viewPager=findViewById(R.id.pagerView);
        pagerAdapter=new SlidePagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);
//        viewPager.setOffscreenPageLimit(4);
//
//        fragmentA4=new A4Fragment(this);
//        fragmentStretchL=new StretchFilmLarge();
//        fragmentStretchS=new StretchFilmSmall();


//        transaction=fragmentManager.beginTransaction();
//        transaction.replace(R.id.frameLayout,fragmentA4).commitAllowingStateLoss();
//    }

//    public void clickHandler(View view){
//        transaction=fragmentManager.beginTransaction();
//        switch(view.getId()){
//            case R.id.button:
//                transaction.replace(R.id.frameLayout,fragmentA4).commitAllowingStateLoss();
//                break;
//            case R.id.button2:
//                transaction.replace(R.id.frameLayout,fragmentStretchL).commitAllowingStateLoss();
//                break;
//            case R.id.button3:
//                transaction.replace(R.id.frameLayout,fragmentStretchS).commitAllowingStateLoss();
//                break;
//            case R.id.button4:
//                ArrayCollection collection=new ArrayCollection();
//                collection.ArrayExtract();
//                collection.callCalendar();

        }

    @Override
    public void onBackPressed() {
        if(viewPager.getCurrentItem()==0){

        super.onBackPressed();
    }else{
            viewPager.setCurrentItem(viewPager.getCurrentItem()-1);
        }
}


    class SlidePagerAdapter extends FragmentStateAdapter {

        public SlidePagerAdapter(FragmentActivity mainActivity) {
            super(mainActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            Fragment fM = null;
            switch(position){
                case 0:
                case 3:
                    fM=new A4Fragment();
                    break;
                case 1:
                case 4:
                    fM=new StretchFilmLarge();
                    break;
                case 2:
                case 5:
                    fM=new StretchFilmSmall();
                    break;

            }

            return fM;

        }

        @Override
        public int getItemCount() {
            ArrayCollection data=new ArrayCollection();

            return  3;
        }

    }
}
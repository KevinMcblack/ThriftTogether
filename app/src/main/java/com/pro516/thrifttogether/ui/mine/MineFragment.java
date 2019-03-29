package com.pro516.thrifttogether.ui.mine;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;

import com.pro516.thrifttogether.R;
import com.pro516.thrifttogether.ui.base.BaseFragment;

/**
 * Created by hncboy on 2019-03-19.
 */
public class MineFragment extends BaseFragment {
    private LinearLayout mine_setting;

    @Override
    protected void init(View view) {
        mine_setting = view.findViewById(R.id.mine_setting);
        setListeners();
    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        mine_setting.setOnClickListener(onClick);

    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.mine_setting:
                    intent = new Intent(getActivity(), MineSetting.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_mine;
    }
}

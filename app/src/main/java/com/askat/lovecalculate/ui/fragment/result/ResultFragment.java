package com.askat.lovecalculate.ui.fragment.result;


import static com.askat.lovecalculate.ui.fragment.main.MainFragment.FNAME;
import static com.askat.lovecalculate.ui.fragment.main.MainFragment.KEY;
import static com.askat.lovecalculate.ui.fragment.main.MainFragment.SNAME;

import android.os.Bundle;

import com.askat.lovecalculate.R;
import com.askat.lovecalculate.base.BaseFragment;
import com.askat.lovecalculate.databinding.FragmentResultBinding;


public class ResultFragment extends BaseFragment<FragmentResultBinding> {

    @Override
    protected FragmentResultBinding bind() {
        return FragmentResultBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setupUI() {
        initResult();
    }

    private void initResult() {
        if (getArguments() != null){
            String percentage = getArguments().getString(KEY);
            String firstName = getArguments().getString(FNAME);
            String secondName = getArguments().getString(SNAME);

            binding.txtFirstNameResult.setText(firstName);
            binding.txtSecondNameResult.setText(secondName);
            binding.txtResultResult.setText(percentage);

            binding.imgToHistoryResult.setOnClickListener(v -> {
                Bundle bundle = new Bundle();
                bundle.putString("percentage", percentage);
                bundle.putString("firstName", firstName);
                bundle.putString("secondName", secondName);
                controller.navigate(R.id.historyFragment, bundle);
            });
        }
    }
}
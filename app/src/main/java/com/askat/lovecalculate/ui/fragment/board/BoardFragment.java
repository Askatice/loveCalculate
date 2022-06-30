package com.askat.lovecalculate.ui.fragment.board;



import com.askat.lovecalculate.base.BaseFragment;
import com.askat.lovecalculate.databinding.FragmentBoardBinding;
import com.askat.lovecalculate.ui.fragment.board.boardadapter.BoardAdapter;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class BoardFragment extends BaseFragment<FragmentBoardBinding> {


    @Override
    protected FragmentBoardBinding bind() {
        return FragmentBoardBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setupUI() {
        initAdapter();
    }

    @Override
    protected void setupObserver() {
        super.setupObserver();
        initClicker();
    }

    private void initClicker() {
        binding.toMain.setOnClickListener(v ->
                navigateUp());
    }

    public void navigateUp(){
        controller.navigateUp();
    }

    private void initAdapter() {
        BoardAdapter adapter = new BoardAdapter();
        binding.vpBoard.setAdapter(adapter);
    }
}
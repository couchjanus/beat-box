package com.example.bieabox;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import com.example.bieabox.databinding.FragmentBeatBoxBinding;
//import com.example.bieabox.databinding.ListItemSoundBinding;


public class BeatBoxFragment extends Fragment {

    private BeatBox mBeatBox;

    public static BeatBoxFragment newInstance() {
        return new BeatBoxFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBeatBox = new BeatBox(getActivity());
    }

    @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container,
                                                      Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_beat_box, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.wrap_content);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        recyclerView.setAdapter(new SoundAdapter(mBeatBox.getSounds()));

//        FragmentBeatBoxBinding binding = DataBindingUtil
//                .inflate(inflater, R.layout.fragment_beat_box, container, false);
//

//        binding.recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
//        binding.recyclerView.setAdapter(new SoundAdapter());
//        binding.recyclerView.setAdapter(new SoundAdapter(mBeatBox.getSounds()));
//        return binding.getRoot();
        return view;
    }

    private class SoundHolder extends RecyclerView.ViewHolder {
//        private ListItemSoundBinding mBinding;

//        private SoundHolder(ListItemSoundBinding binding) {
//            super(binding.getRoot());
//            mBinding = binding;
////            mBinding.setViewModel(new SoundViewModel(mBeatBox));
//        }
        private SoundHolder(LayoutInflater inflater, ViewGroup container) {
            super(inflater.inflate(R.layout.list_item_sound, container, false));
//            mBinding = binding;
//            mBinding.setViewModel(new SoundViewModel(mBeatBox));
        }

//        public void bind(Sound sound) {
//            mBinding.getViewModel().setSound(sound);
//            mBinding.executePendingBindings();
//        }
    }

    private class SoundAdapter extends RecyclerView.Adapter<SoundHolder> {
        private List<Sound> mSounds;

        public SoundAdapter(List<Sound> sounds) {
            mSounds = sounds;
        }

//        @Override
//        public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            LayoutInflater inflater = LayoutInflater.from(getActivity());
//            ListItemSoundBinding binding = DataBindingUtil
//                    .inflate(inflater, R.layout.list_item_sound, parent, false);
//            return new SoundHolder(binding);
//        }


        @Override
        public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new SoundHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(SoundHolder holder, int position) {
//            Sound sound = mSounds.get(position);
//            holder.bind(sound);
        }

        @Override
        public int getItemCount() {
//            return 0;
            return mSounds.size();
        }
    }
}
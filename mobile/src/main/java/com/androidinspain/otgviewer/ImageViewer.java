package com.androidinspain.otgviewer;

import android.widget.ImageView;

import com.github.mjdev.libaums.fs.UsbFile;

/**
 * Created by roberto on 23/08/15.
 */
public class ImageViewer {
    private static ImageViewer mInstance = null;

    private UsbFile mCurrentDirectory;
    private UsbFile mCurrentFile;
    private UsbFileListAdapter mAdapter;


    private ImageViewer(){
        mCurrentFile = null;
        mCurrentDirectory = null;
        mAdapter = null;
    }

    public static ImageViewer getInstance(){
        if(mInstance == null) {
            mInstance = new ImageViewer();
        }
        return mInstance;
    }

    public UsbFile getCurrentDirectory(){
        return this.mCurrentDirectory;
    }

    public UsbFile getCurrentFile(){
        return this.mCurrentFile;
    }

    public void setCurrentDirectory(UsbFile dir){
        mCurrentDirectory = dir;
    }

    public void setCurrentFile(UsbFile file){
        mCurrentFile = file;
    }

    public void setAdapter(UsbFileListAdapter adapter){
        mAdapter = adapter;
    }

    public UsbFileListAdapter getAdapter(){
        return mAdapter;
    }

}

package cn.sddman.download.thread;

import android.os.AsyncTask;
import android.os.SystemClock;

import java.util.List;

import cn.sddman.download.mvp.e.DownloadTaskEntity;
import cn.sddman.download.util.DownUtil;

public class DownLoadingTask extends AsyncTask<Void,List<DownloadTaskEntity>,List<DownloadTaskEntity>> {
    public DownLoadingTask(){

    }
    @Override
    protected List<DownloadTaskEntity> doInBackground(Void... objects) {
        while (DownUtil.getInstance().isIsLoopDown()){
            DownUpdateUI.getInstance().downUpdate();
            SystemClock.sleep(1000);
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(List<DownloadTaskEntity>... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(List<DownloadTaskEntity> downloadTaskEntities) {
        super.onPostExecute(downloadTaskEntities);
    }
}

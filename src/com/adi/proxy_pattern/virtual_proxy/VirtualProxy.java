package com.adi.proxy_pattern.virtual_proxy;
import java.util.concurrent.TimeUnit;
public class VirtualProxy implements Picture{
    private volatile Picture concretePicture;
    private volatile boolean exist = false;
    public void setConcretePicture(Picture concretePicture) {
        this.concretePicture = concretePicture;
    }
    @Override
    public void show() {
        if (!exist) {
            System.out.println("显示缩略图");
        } else {
            concretePicture.show();
        }
    }
    @Override
    public void download() {
        while(!exist) {
            synchronized (this) {
                if (concretePicture == null) {
                    Thread t = new Thread(() -> { //加载真实图像
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        this.setConcretePicture(new ConcretePicture());
                        exist = true;
                    });
                    t.start();
                }
            }
        }
        concretePicture.download();
    }
}

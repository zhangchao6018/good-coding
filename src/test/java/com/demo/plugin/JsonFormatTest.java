package com.demo.plugin;

import com.demo.validation.UserInfo;

/**
 * @Description:
 * @Author: zhangchao
 * @Date: 3/30/20 9:24 下午
 **/
public class JsonFormatTest {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();

    }

    /**
     * errorno : 0
     * web : {"version":"Web版","publish":"2016-10-10 16:40","feature_tips":""}
     * windows : {"version":"Windows版 V3.9.6","publish":"2015-11-18 15:10:51","size":"6.63MB","system":"XP/vista/win7/win8","feature_tips":"windows版可以xxx啦"}
     * android : {"title":"Android版 V10.0.175","version":"Android版 V10.0.175","url":"https://wppkg.baidupcs.com/issue/netdisk/apk/BaiduNetdisk_10.0.175.apk","url_1":"","publish":"2020-03-20 22:36:00 ","size":"101 M","system":"Android 4.1及以上版本 ","feature_tips":""}
     * iphone : {"title":"iPhone版 V10.0.172","version":"iPhone版 V10.0.172","url":"","url_1":"","publish":"2020-03-22 11:18:00","size":"226M","system":"iOS9.0及以上版本","feature_tips":""}
     * ipad : {"title":"iPad版 V10.0.152","version":"iPad版 V10.0.152","url":"","url_1":"","publish":"2020-03-18 11:53:00","size":"216.9M","system":"iOS9.0及以上版本","feature_tips":""}
     * winphone : {"version":"WinPhone版 V3.1.0","publish":"2013-06-15 11:52","size":"3M","system":"Windows Phone 7.5 及Windows Phone 8","feature_tips":""}
     * guanjia : {"title":"百度网盘PC版V6.9.1","version":"百度网盘PC版V6.9.1","url":"http://wppkg.baidupcs.com/issue/netdisk/yunguanjia/BaiduNetdisk_6.9.1.2.exe","url_1":"","publish":"2020-03-18 21:36:00","size":"34.7 M","system":"XP/vista/win7/win8/win10","feature_tips":""}
     * mac : {"title":"Mac版 V3.0.6","version":"Mac版 V3.0.6","url":"http://wppkg.baidupcs.com/issue/netdisk/MACguanjia/BaiduNetdisk_mac_3.0.6.2.dmg","url_1":"","publish":"2020-03-25 17:35:00","size":"70.4 M","system":"Mac OS X 10.10+","feature_tips":"mac版可以xxx啦"}
     * linux : {"title":"Linux版 V3.0.1","version":"Linux版 V3.0.1","url":"http://wppkg.baidupcs.com/issue/netdisk/LinuxGuanjia/3.0.1/baidunetdisk_linux_3.0.1.2.rpm","url_1":"http://wppkg.baidupcs.com/issue/netdisk/LinuxGuanjia/3.0.1/baidunetdisk_linux_3.0.1.2.deb","publish":"2019-11-22 12:45:33","size":"65.6M","system":"中标麒麟桌面操作系统软件（兆芯版） V7.0、Ubuntu V18.04","feature_tips":"文件安全存储，云端轻松管理，图片快速预览....."}
     * yikeios : {"title":"一刻相册1.6.1主要更新","version":"1.6.1","url":"","url_1":"","publish":"","size":"","system":"","feature_tips":""}
     * yikeandroid : {"title":"一刻相册1.4.1主要更新","version":"1.4.1","url":"","url_1":"","publish":"","size":"","system":"","feature_tips":""}
     */

    private int errorno;
    private WebBean web;
    private WindowsBean windows;
    private AndroidBean android;
    private IphoneBean iphone;
    private IpadBean ipad;
    private WinphoneBean winphone;
    private GuanjiaBean guanjia;
    private MacBean mac;
    private LinuxBean linux;
    private YikeiosBean yikeios;
    private YikeandroidBean yikeandroid;

    public int getErrorno() {
        return errorno;
    }

    public void setErrorno(int errorno) {
        this.errorno = errorno;
    }

    public WebBean getWeb() {
        return web;
    }

    public void setWeb(WebBean web) {
        this.web = web;
    }

    public WindowsBean getWindows() {
        return windows;
    }

    public void setWindows(WindowsBean windows) {
        this.windows = windows;
    }

    public AndroidBean getAndroid() {
        return android;
    }

    public void setAndroid(AndroidBean android) {
        this.android = android;
    }

    public IphoneBean getIphone() {
        return iphone;
    }

    public void setIphone(IphoneBean iphone) {
        this.iphone = iphone;
    }

    public IpadBean getIpad() {
        return ipad;
    }

    public void setIpad(IpadBean ipad) {
        this.ipad = ipad;
    }

    public WinphoneBean getWinphone() {
        return winphone;
    }

    public void setWinphone(WinphoneBean winphone) {
        this.winphone = winphone;
    }

    public GuanjiaBean getGuanjia() {
        return guanjia;
    }

    public void setGuanjia(GuanjiaBean guanjia) {
        this.guanjia = guanjia;
    }

    public MacBean getMac() {
        return mac;
    }

    public void setMac(MacBean mac) {
        this.mac = mac;
    }

    public LinuxBean getLinux() {
        return linux;
    }

    public void setLinux(LinuxBean linux) {
        this.linux = linux;
    }

    public YikeiosBean getYikeios() {
        return yikeios;
    }

    public void setYikeios(YikeiosBean yikeios) {
        this.yikeios = yikeios;
    }

    public YikeandroidBean getYikeandroid() {
        return yikeandroid;
    }

    public void setYikeandroid(YikeandroidBean yikeandroid) {
        this.yikeandroid = yikeandroid;
    }

    public static class WebBean {
        /**
         * version : Web版
         * publish : 2016-10-10 16:40
         * feature_tips :
         */

        private String version;
        private String publish;
        private String feature_tips;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class WindowsBean {
        /**
         * version : Windows版 V3.9.6
         * publish : 2015-11-18 15:10:51
         * size : 6.63MB
         * system : XP/vista/win7/win8
         * feature_tips : windows版可以xxx啦
         */

        private String version;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class AndroidBean {
        /**
         * title : Android版 V10.0.175
         * version : Android版 V10.0.175
         * url : https://wppkg.baidupcs.com/issue/netdisk/apk/BaiduNetdisk_10.0.175.apk
         * url_1 :
         * publish : 2020-03-20 22:36:00
         * size : 101 M
         * system : Android 4.1及以上版本
         * feature_tips :
         */

        private String title;
        private String version;
        private String url;
        private String url_1;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl_1() {
            return url_1;
        }

        public void setUrl_1(String url_1) {
            this.url_1 = url_1;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class IphoneBean {
        /**
         * title : iPhone版 V10.0.172
         * version : iPhone版 V10.0.172
         * url :
         * url_1 :
         * publish : 2020-03-22 11:18:00
         * size : 226M
         * system : iOS9.0及以上版本
         * feature_tips :
         */

        private String title;
        private String version;
        private String url;
        private String url_1;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl_1() {
            return url_1;
        }

        public void setUrl_1(String url_1) {
            this.url_1 = url_1;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class IpadBean {
        /**
         * title : iPad版 V10.0.152
         * version : iPad版 V10.0.152
         * url :
         * url_1 :
         * publish : 2020-03-18 11:53:00
         * size : 216.9M
         * system : iOS9.0及以上版本
         * feature_tips :
         */

        private String title;
        private String version;
        private String url;
        private String url_1;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl_1() {
            return url_1;
        }

        public void setUrl_1(String url_1) {
            this.url_1 = url_1;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class WinphoneBean {
        /**
         * version : WinPhone版 V3.1.0
         * publish : 2013-06-15 11:52
         * size : 3M
         * system : Windows Phone 7.5 及Windows Phone 8
         * feature_tips :
         */

        private String version;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class GuanjiaBean {
        /**
         * title : 百度网盘PC版V6.9.1
         * version : 百度网盘PC版V6.9.1
         * url : http://wppkg.baidupcs.com/issue/netdisk/yunguanjia/BaiduNetdisk_6.9.1.2.exe
         * url_1 :
         * publish : 2020-03-18 21:36:00
         * size : 34.7 M
         * system : XP/vista/win7/win8/win10
         * feature_tips :
         */

        private String title;
        private String version;
        private String url;
        private String url_1;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl_1() {
            return url_1;
        }

        public void setUrl_1(String url_1) {
            this.url_1 = url_1;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class MacBean {
        /**
         * title : Mac版 V3.0.6
         * version : Mac版 V3.0.6
         * url : http://wppkg.baidupcs.com/issue/netdisk/MACguanjia/BaiduNetdisk_mac_3.0.6.2.dmg
         * url_1 :
         * publish : 2020-03-25 17:35:00
         * size : 70.4 M
         * system : Mac OS X 10.10+
         * feature_tips : mac版可以xxx啦
         */

        private String title;
        private String version;
        private String url;
        private String url_1;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl_1() {
            return url_1;
        }

        public void setUrl_1(String url_1) {
            this.url_1 = url_1;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class LinuxBean {
        /**
         * title : Linux版 V3.0.1
         * version : Linux版 V3.0.1
         * url : http://wppkg.baidupcs.com/issue/netdisk/LinuxGuanjia/3.0.1/baidunetdisk_linux_3.0.1.2.rpm
         * url_1 : http://wppkg.baidupcs.com/issue/netdisk/LinuxGuanjia/3.0.1/baidunetdisk_linux_3.0.1.2.deb
         * publish : 2019-11-22 12:45:33
         * size : 65.6M
         * system : 中标麒麟桌面操作系统软件（兆芯版） V7.0、Ubuntu V18.04
         * feature_tips : 文件安全存储，云端轻松管理，图片快速预览.....
         */

        private String title;
        private String version;
        private String url;
        private String url_1;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl_1() {
            return url_1;
        }

        public void setUrl_1(String url_1) {
            this.url_1 = url_1;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class YikeiosBean {
        /**
         * title : 一刻相册1.6.1主要更新
         * version : 1.6.1
         * url :
         * url_1 :
         * publish :
         * size :
         * system :
         * feature_tips :
         */

        private String title;
        private String version;
        private String url;
        private String url_1;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl_1() {
            return url_1;
        }

        public void setUrl_1(String url_1) {
            this.url_1 = url_1;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }

    public static class YikeandroidBean {
        /**
         * title : 一刻相册1.4.1主要更新
         * version : 1.4.1
         * url :
         * url_1 :
         * publish :
         * size :
         * system :
         * feature_tips :
         */

        private String title;
        private String version;
        private String url;
        private String url_1;
        private String publish;
        private String size;
        private String system;
        private String feature_tips;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl_1() {
            return url_1;
        }

        public void setUrl_1(String url_1) {
            this.url_1 = url_1;
        }

        public String getPublish() {
            return publish;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getFeature_tips() {
            return feature_tips;
        }

        public void setFeature_tips(String feature_tips) {
            this.feature_tips = feature_tips;
        }
    }
}

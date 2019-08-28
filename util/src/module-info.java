/**
 * 貌似这个module 的名字和项目的名字没有关系,这里叫 myUtil;
 * 这个的名字确实没啥关系,只是require的时候写一样的就好了
 * 这个名字,就是普通java类名字,只能使用大小的英语和数字,不能出现-,可以使用.  ,例如:com.onyx.util3
 */
module util {

    /**
     * exports 标明对外提供的包名字
     * com.onyx.util2 暂时不对外提供
     */
    exports com.onyx.util;

    /**
     * exports 只能对包进行报错, 不能对类进行操作
     */
    //exports com.onyx.util2.ListUtil;

    /**
     * exports 的包不能为空, 也不能不存在
     */
    //exports com.onyx.util3;


}
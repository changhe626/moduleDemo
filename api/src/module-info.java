module api {
    exports com.onyx.api;
    requires base;
    requires service;
    /**
     * 如果事先写了requires ,但是在代码中没有引用到这模块的内容,这里会报错的
     * 这里是用自定义的名字
     */
    //requires myUtil;
    requires util;

}
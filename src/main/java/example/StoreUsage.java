/*
 *@Type Usage.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/6/13 03:59
 * @version
 */
package example;

import service.NormalStore;

import java.io.File;
import java.io.IOException;

public class StoreUsage {
    public static void main(String[] args) throws IOException {
        String dataDir="data"+ File.separator;
        NormalStore store = new NormalStore(dataDir);
//        store.set("zsy1","1fdhdfth");
//        store.set("zsy2","2");
//        store.set("zsy3","3");
//        store.set("zsy4","你好");
//        store.get("zsy2");
//        System.out.println(store.get("zsy4"));
//        store.rm("zsy4");
//        System.out.println(store.get("zsy4"));
//        store.set("zsy2","letItgo");
//        System.out.println(store.get("zsy2"));
    }
}

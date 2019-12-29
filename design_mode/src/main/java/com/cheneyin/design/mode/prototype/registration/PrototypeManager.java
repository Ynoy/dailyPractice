package com.cheneyin.design.mode.prototype.registration;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: PrototypeManager
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-29
 */
public class PrototypeManager {
    private static Map<String, Prototype> map = new HashMap<>();

    private PrototypeManager() {
    }

    public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    public synchronized static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);
        if (prototype == null) {
            throw new Exception("未找到" + prototypeId + "所对应的Prototype");
        }
        return prototype;
    }
}

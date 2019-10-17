package com.xuhui.story_utils.JsonUtil;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {

    /**
     * 字符串是否是Json格式
     * @param string
     * @return
     */
    public static boolean isJsonString(String string){
        boolean isJson = true;
        if(string.isEmpty()){
            isJson = false;
        }
        try {
            JSONObject jsonObject = new JSONObject(string);
            isJson = true;
        } catch (JSONException e) {
            isJson = false;
        }
        return isJson;
    }
}

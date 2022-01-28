package engineer.temp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {




//        String code = "eyJpZCI6IkRoWDV3WVRYajhtUlJZM2prZHltZjFQbkRpbEtEUVVHbXRtSnMyOVRGZWNoUGdFYjZiYVNhZlh5K2lnVlhGTUNNN3pDRkVsNGxEaERGOGwzRWVsRmdWajZBdlI1Y2ROTllcL0tBWVQ1dW1za05meW03ZCsrajNvMzhCSkhLTUgxVXFkMmhwdjhKZTYrZTl0MmZhNTA2bFN2R2xjQzBKUEhIS202SXBzbzZsc3hGVTlZT2tEOTJlQ3B1MHVTQlhmY0tHbEVHa01jWnBTbE12S1dXXC9MS2phN3JIYjJ3THlrV1d5bVhkTWtJcEZORT0iLCJhZFNsb3QiOiI2MDAwOCIsInRlbXBsYXRlSWQiOiJCT09UIiwiZXZlbnQiOiJDTElDSyIsInByb3BzIjpudWxsLCJhZF90ZW1wbGF0ZSI6IkJvb3RBZFRlbXBsYXRlIiwiYWRfbWF0ZXJpYWxfaWQiOiJJREVBLWtNWThTTmt0IiwiZXh0SW5mbyI6eyJtb25pdG9yRGF0YSI6eyJtaWFvWmhlbiI6eyJwbGF5VmlkZW9VcmwiOiJodHRwczpcL1wveGlhb2R1LmJhaWR1LmNvbVwvYWRcL29wZW5hcGlcL3Rlc3QiLCJleGl0VmlkZW9VcmwiOiJodHRwczpcL1wveGlhb2R1LmJhaWR1LmNvbVwvYWRcL29wZW5hcGlcL3Rlc3QiLCJlbnRlckxhbmRpbmdQYWdlVXJsIjoiaHR0cHM6XC9cL3hpYW9kdS5iYWlkdS5jb21cL2FkXC9vcGVuYXBpXC90ZXN0IiwiZXhpdExhbmRpbmdQYWdlVXJsIjoiaHR0cHM6XC9cL3hpYW9kdS5iYWlkdS5jb21cL2FkXC9vcGVuYXBpXC90ZXN0IiwiZWZmZWN0aXZlRXhwb3N1cmVEdXJhdGlvbiI6MH0sInJlcG9ydFR5cGUiOiJDTE9VRF9SRVBPUlQiLCJhZHZlcnRpc2VtZW50TmFtZSI6IjJcdTc1MzVcdTg5YzYifX19";


//        String code = "eyJpZCI6IkRoWDV3WVRYajhtUlJZM2prZHltZjFQbkRpbEtEUVVHbXRtSnMyOVRGZWNoUGdFYjZiYVNhZlh5K2lnVlhGTUNNN3pDRkVsNGxEaERGOGwzRWVsRmdWajZBdlI1Y2ROTllcL0tBWVQ1dW1za05meW03ZCsrajNvMzhCSkhLTUgxVXFkMmhwdjhKZTYrZTl0MmZhNTA2bFN2R2xjQzBKUEhIS202SXBzbzZsc3hGVTlZT2tEOTJlQ3B1MHVTQlhmY0tHbEVHa01jWnBTbE12S1dXXC9MS2phN3JIYjJ3THlrV1d5bVhkTWtJcEZORT0iLCJhZFNsb3QiOiI2MDAwOCIsInRlbXBsYXRlSWQiOiJCT09UIiwiZXZlbnQiOiJFWFBPU1VSRSIsInByb3BzIjpudWxsLCJhZF90ZW1wbGF0ZSI6IkJvb3RBZFRlbXBsYXRlIiwiYWRfbWF0ZXJpYWxfaWQiOiJJREVBLWtNWThTTmt0IiwiZXh0SW5mbyI6eyJtb25pdG9yRGF0YSI6eyJtaWFvWmhlbiI6eyJwbGF5VmlkZW9VcmwiOiJodHRwczpcL1wveGlhb2R1LmJhaWR1LmNvbVwvYWRcL29wZW5hcGlcL3Rlc3QiLCJleGl0VmlkZW9VcmwiOiJodHRwczpcL1wveGlhb2R1LmJhaWR1LmNvbVwvYWRcL29wZW5hcGlcL3Rlc3QiLCJlbnRlckxhbmRpbmdQYWdlVXJsIjoiaHR0cHM6XC9cL3hpYW9kdS5iYWlkdS5jb21cL2FkXC9vcGVuYXBpXC90ZXN0IiwiZXhpdExhbmRpbmdQYWdlVXJsIjoiaHR0cHM6XC9cL3hpYW9kdS5iYWlkdS5jb21cL2FkXC9vcGVuYXBpXC90ZXN0IiwiZWZmZWN0aXZlRXhwb3N1cmVEdXJhdGlvbiI6MH0sInJlcG9ydFR5cGUiOiJDTE9VRF9SRVBPUlQiLCJhZHZlcnRpc2VtZW50TmFtZSI6IjJcdTc1MzVcdTg5YzYifX19";

//        String code = "eyJpZCI6IkRoWDV3WVRYajhtUlJZM2prZHltZjFQbkRpbEtEUVVHbXRtSnMyOVRGZWNoUGdFYjZiYVNhZlh5K2lnVlhGTUNNN3pDRkVsNGxEaERGOGwzRWVsRmdWajZBdlI1Y2ROTllcL0tBWVQ1dW1za05meW03ZCsrajNvMzhCSkhLTUgxVXFkMmhwdjhKZTYrZTl0MmZhNTA2bFN2R2xjQzBKUEhIS202SXBzbzZsc3hGVTlZT2tEOTJlQ3B1MHVTQlhmY0tHbEVHa01jWnBTbE12S1dXXC9MS2phN3JIYjJ3THlrV1d5bVhkTWtJcEZORT0iLCJhZFNsb3QiOiI2MDAwOCIsInRlbXBsYXRlSWQiOiJCT09UIiwiZXZlbnQiOiJCT09UX0FEX0NMT1NFIiwicHJvcHMiOm51bGwsImFkX3RlbXBsYXRlIjoiQm9vdEFkVGVtcGxhdGUiLCJhZF9tYXRlcmlhbF9pZCI6IklERUEta01ZOFNOa3QiLCJleHRJbmZvIjp7Im1vbml0b3JEYXRhIjp7Im1pYW9aaGVuIjp7InBsYXlWaWRlb1VybCI6Imh0dHBzOlwvXC94aWFvZHUuYmFpZHUuY29tXC9hZFwvb3BlbmFwaVwvdGVzdCIsImV4aXRWaWRlb1VybCI6Imh0dHBzOlwvXC94aWFvZHUuYmFpZHUuY29tXC9hZFwvb3BlbmFwaVwvdGVzdCIsImVudGVyTGFuZGluZ1BhZ2VVcmwiOiJodHRwczpcL1wveGlhb2R1LmJhaWR1LmNvbVwvYWRcL29wZW5hcGlcL3Rlc3QiLCJleGl0TGFuZGluZ1BhZ2VVcmwiOiJodHRwczpcL1wveGlhb2R1LmJhaWR1LmNvbVwvYWRcL29wZW5hcGlcL3Rlc3QiLCJlZmZlY3RpdmVFeHBvc3VyZUR1cmF0aW9uIjowfSwicmVwb3J0VHlwZSI6IkNMT1VEX1JFUE9SVCIsImFkdmVydGlzZW1lbnROYW1lIjoiMlx1NzUzNVx1ODljNiJ9fX0";

        String code = "eyJpZCI6IkRoWDV3WVRYajhtUlJZM2prZHltZjFQbkRpbEtEUVVHbXRtSnMyOVRGZWNoUGdFYjZiYVNhZlh5K2lnVlhGTUNNN3pDRkVsNGxEaERGOGwzRWVsRmdWajZBdlI1Y2ROTllcL0tBWVQ1dW1za05meW03ZCsrajNvMzhCSkhLTUgxVXFkMmhwdjhKZTYrZTl0MmZhNTA2bFN2R2xjQzBKUEhIS202SXBzbzZsc3hGVTlZT2tEOTJlQ3B1MHVTQlhmY0tHbEVHa01jWnBTbE12S1dXXC9MS2phN3JIYjJ3THlrV1d5bVhkTWtJcEZORT0iLCJhZFNsb3QiOiI2MDAwOCIsInRlbXBsYXRlSWQiOiJCT09UIiwiZXZlbnQiOiJCT09UX0FEX0xBTkRJTkdfUEFHRV9DTE9TRSIsInByb3BzIjpudWxsLCJhZF90ZW1wbGF0ZSI6IkJvb3RBZFRlbXBsYXRlIiwiYWRfbWF0ZXJpYWxfaWQiOiJJREVBLWtNWThTTmt0IiwiZXh0SW5mbyI6eyJtb25pdG9yRGF0YSI6eyJtaWFvWmhlbiI6eyJwbGF5VmlkZW9VcmwiOiJodHRwczpcL1wveGlhb2R1LmJhaWR1LmNvbVwvYWRcL29wZW5hcGlcL3Rlc3QiLCJleGl0VmlkZW9VcmwiOiJodHRwczpcL1wveGlhb2R1LmJhaWR1LmNvbVwvYWRcL29wZW5hcGlcL3Rlc3QiLCJlbnRlckxhbmRpbmdQYWdlVXJsIjoiaHR0cHM6XC9cL3hpYW9kdS5iYWlkdS5jb21cL2FkXC9vcGVuYXBpXC90ZXN0IiwiZXhpdExhbmRpbmdQYWdlVXJsIjoiaHR0cHM6XC9cL3hpYW9kdS5iYWlkdS5jb21cL2FkXC9vcGVuYXBpXC90ZXN0IiwiZWZmZWN0aXZlRXhwb3N1cmVEdXJhdGlvbiI6MH0sInJlcG9ydFR5cGUiOiJDTE9VRF9SRVBPUlQiLCJhZHZlcnRpc2VtZW50TmFtZSI6IjJcdTc1MzVcdTg5YzYifX19";

        byte[] tt = Base64.getUrlDecoder().decode(code);
        String jsonStr = new String(tt);

        String json = formatJson(jsonStr);
        System.out.println(json);
    }

    private static String formatJson(String str) {
        Object object = JSONObject.parse(str);
        return JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.SortField, SerializerFeature.MapSortField,
//        SerializerFeature.BrowserCompatible,
                SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
    }
}
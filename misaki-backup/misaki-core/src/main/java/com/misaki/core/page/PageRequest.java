package com.misaki.core.page;

import java.util.HashMap;
import java.util.Map;

public class PageRequest {
    private int pageNum = 1;
    private int pageSize = 10;
    private Map<String, Object> params = new HashMap<>();
}

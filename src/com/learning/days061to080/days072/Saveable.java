package com.learning.days061to080.days072;

import java.util.List;

public interface Saveable {
    List<String> write();
    void read(List<String> savedValues);
}

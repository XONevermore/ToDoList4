package com.example.sardor.todolist.Module;

import com.example.sardor.todolist.Info;

import java.util.ArrayList;
import java.util.List;

public class Suplier {
    public List<Info> infos = new ArrayList<>();

    public Suplier(){
        infos.add(new Info("Jumping", "I must jump 3 time. Each one at least 30 minutes"));
    }
}

package com.nstrivex.myFirstProject;

import org.springframework.stereotype.Component;

@Component("petrolCar")
public class PetrolCar implements Engines
{
    private long model;
    private String name;
    private String content;

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getModel() {
        return model;
    }

    public void setModel(long model) {
        this.model = model;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String engs()
    {
        return "Petrol engine activated Successfully!";
    }

    @Override
    public String eng() {
        return null;
    }
}

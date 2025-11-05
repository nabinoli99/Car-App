package com.nstrivex.myFirstProject;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("electricCar")

public class ElectricCar implements Engines
{
    private long model;
    private String name;
    private String content;

    public long getModel()
    {
        return model;
    }

    public void setModel(long model)
    {
        this.model = model;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    @Override
    public String eng() {
        return "Electric Engine Activated Successfully!";
    }

    @Override
    public String engs() {
        return null;
    }
}

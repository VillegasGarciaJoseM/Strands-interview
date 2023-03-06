package com.strands.interviews.eventsystem.events;

import com.strands.interviews.eventsystem.InterviewEvent;

public class GeneralEvent implements InterviewEvent
{

    private Object source;

    public GeneralEvent(Object source)
    {
        this.source = source;
    }

    public Object getSource()
    {
        return source;
    }
}
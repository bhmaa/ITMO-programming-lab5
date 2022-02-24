package com.bhma.client.commands;


import com.bhma.client.exceptions.IllegalValueException;
import com.bhma.client.exceptions.NoSuchCommandException;
import com.bhma.client.exceptions.ScriptException;

/**
 * parent of all commands
 */
public abstract class Command {
    private final String name;
    private final String description;
    private boolean executeFlag = true;

    public Command(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void execute(String argument) throws NoSuchCommandException, ScriptException, IllegalValueException;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getExecuteFlag() {
        return executeFlag;
    }

    public void setExecuteFlag(boolean executeFlag) {
        this.executeFlag = executeFlag;
    }
}

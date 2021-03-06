package com.bhma.client.commands;

import com.bhma.client.exceptions.NoSuchCommandException;
import com.bhma.client.utility.InputManager;

/**
 * execute_script command
 */
public class ExecuteScriptCommand extends Command {
    private final InputManager inputManager;

    public ExecuteScriptCommand(InputManager inputManager) {
        super("execute_script", "считать и исполнить скрипт из указанного файла");
        this.inputManager = inputManager;
    }

    /**
     * switches input manager to a script mode
     * @param argument mustn't be empty
     * @throws NoSuchCommandException if argument is empty
     */
    public void execute(String argument) throws NoSuchCommandException {
        if (argument.isEmpty()) {
            throw new NoSuchCommandException();
        }
        inputManager.startReadScript(argument);
    }
}

package com.frogermcs.gactions.api;

/**
 * Standard action intents handled by Google Assistant
 */
public class StandardIntents {
    /**
     * Assistant fires MAIN intent for queries like [talk to $action].
     */
    public static final String MAIN = "actions.intent.MAIN";
    /**
     * Assistant fires TEXT intent when action issues ask intent.
     */
    public static final String TEXT = "actions.intent.TEXT";
    /**
     * Assistant fires PERMISSION intent when action invokes askForPermission.
     */
    public static final String PERMISSION = "actions.intent.PERMISSION";
}

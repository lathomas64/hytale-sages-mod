package dev.biomancy.commands;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class DebugCommand extends AbstractCommand {

    public DebugCommand(String name, String description) {
        super(name, description);
    }

    @Nullable
    @Override
    protected CompletableFuture<Void> execute(@Nonnull CommandContext context) {
        context.sendMessage(Message.raw("Hello from DebugCommand! We aren't spawning anything yet but here is where it would be."));
        return CompletableFuture.completedFuture(null);
    }

}

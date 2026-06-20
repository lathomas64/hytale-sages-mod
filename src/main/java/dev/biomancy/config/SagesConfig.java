package dev.biomancy.config;

import com.hypixel.hytale.codec.Codec;
import com.hypixel.hytale.codec.KeyedCodec;
import com.hypixel.hytale.codec.builder.BuilderCodec;

public class SagesConfig {

    public static final BuilderCodec<SagesConfig> CODEC = BuilderCodec.builder(SagesConfig.class, SagesConfig::new)
            .append(
                new KeyedCodec<>("EnableWelcomeMessage", Codec.BOOLEAN),
                (exConfig, aBoolean, extraInfo) -> exConfig.enabledWelcomeMessage = aBoolean,
                (exConfig, extraInfo) -> exConfig.enabledWelcomeMessage
            )
            .add()
            .build();

    private boolean enabledWelcomeMessage;

    private SagesConfig() {}

    public boolean isEnabledWelcomeMessage() {
        return enabledWelcomeMessage;
    }
}

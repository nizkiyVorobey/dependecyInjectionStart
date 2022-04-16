package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    /**
     * Уявімо, що Monitor це не наш клас, а клас з якосїсь сторонньої бібліоткеи, і ми не можемо там використати
     * @Ingect, тож щоб Dagger знав, як стортити цей клас ми використаємо @Provides. Їх потрібно стоврбвати у @Module
     *
     * Отже спочатку Dagger буде шукати @Ingect у цього класа, а коли не знайде то буде шукати у @Module
     *
     *
     * Ми можемо видалити усюди @Ingect constructor() і прописати як саме створювати класи тут у @Provides
     */
    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }


    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower {
        return ComputerTower(
            storage = storage,
            memory = memory,
            processor = processor
        )
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(
            monitor = monitor,
            computerTower = computerTower,
            keyboard = keyboard,
            mouse = mouse
        )
    }
}
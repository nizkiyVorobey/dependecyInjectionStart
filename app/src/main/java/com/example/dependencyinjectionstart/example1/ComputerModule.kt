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
     */
    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }
}
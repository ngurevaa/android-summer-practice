package com.anastasiya.task1

object UserRepository {
    val list: List<User> = listOf(
        User(name ="Груня", id = 1, "https://i.pinimg.com/originals/72/cb/40/72cb408a2d1eea2ad6a16c33c04a11fc.jpg", "задумчивая"),
        User(name="Барсик", id=2, url="https://w-dog.ru/wallpapers/5/18/289291145046987/evropejskaya-koshka-dikij-kot-morda-vzglyad.jpg", "без настроения"),
        User("Мурка", 3, "https://mykaleidoscope.ru/x/uploads/posts/2022-09/1663663940_5-mykaleidoscope-ru-p-zloi-vzglyad-kota-emotsii-6.jpg", "не довольная")
    )
}

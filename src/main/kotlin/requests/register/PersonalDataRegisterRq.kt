package ecowind.ru.requests.register

data class PersonalDataRegisterRq(
    val name: String? = null,
    val surname: String? = null,
    val phone: String? = null,
)

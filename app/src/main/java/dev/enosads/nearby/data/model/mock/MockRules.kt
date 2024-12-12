package dev.enosads.nearby.data.model.mock

import dev.enosads.nearby.data.model.Rule

val mockRules = listOf(
    Rule(
        id = "1",
        description = "Disponível até 31/12/2024",
        marketId = "1",
    ),
    Rule(
        id = "2",
        description = "Válido apenas para consumo no local",
        marketId = "1",
    )
)
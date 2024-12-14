package dev.enosads.nearby.data.model.mock

import dev.enosads.nearby.data.model.Market
import dev.enosads.nearby.data.model.Rule

val  mockMarkets = listOf(
    Market(
        id = "1",
        categoryId = "1",
        name = "Sabor Grill",
        description = "Churrascaria com cortes nobres e buffet variado. Experiência completa para os amantes de carne.",
        longitude = -46.65814845249887,
        latitude = -23.57577096636211,
        rules = listOf(
            Rule(id = "1", description = "Disponível até 31/12/2024", marketId = "1"),
            Rule(id = "2", description = "Disponível apenas para consumo local", marketId = "1")
        ),
        coupons = 10,
        phone = "83 93939-3939",
        address = "Rua dos Bobos, 0",
        cover = "https://img.freepik.com/vetores-premium/design-de-logotipo-de-churrascaria-em-chamas_1594-245.jpg"
    ),
    Market(
        id = "2",
        categoryId = "2",
        name = "Padaria do João",
        description = "Pães fresquinhos, bolos caseiros e doces irresistíveis. Perfeito para um café da manhã ou lanche da tarde.",
        longitude = -46.65814845249887,
        latitude = -23.57577096636211,
        rules = emptyList(),
        coupons = 5,
        phone = "83 93939-3939",
        address = "Rua dos Bobos, 0",
        cover = "https://img.freepik.com/vetores-gratis/ilustracao-de-design-de-logotipo-de-padaria_23-2148570985.jpg"
    ),
    Market(
        id = "3",
        categoryId = "3",
        name = "Farmácia Saúde",
        description = "Medicamentos, produtos de higiene e beleza. Cuidando da sua saúde e bem-estar.",
        longitude = -46.65814845249887,
        latitude = -23.57577096636211,
        rules = emptyList(),
        coupons = 2,
        phone = "83 93939-3939",
        address = "Rua dos Bobos, 0",
        cover = "https://img.freepik.com/vetores-premium/logotipo-da-farmacia-com-cruz-medica-e-pilula-no-design-de-logotipo-de-modelo-de-vetor-de-folha_126608-122.jpg"
    ),

)
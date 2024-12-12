package dev.enosads.nearby.ui.component.market_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.enosads.nearby.R
import dev.enosads.nearby.data.model.Market
import dev.enosads.nearby.data.model.mock.mockMarkets
import dev.enosads.nearby.ui.theme.Gray400
import dev.enosads.nearby.ui.theme.Gray500
import dev.enosads.nearby.ui.theme.Typography

@Composable
fun MarketDetailsInfos(modifier: Modifier = Modifier, market: Market) {
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(text = "Informações", style = Typography.headlineSmall, color = Gray400)
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    tint = Gray500,
                    painter = painterResource(id = R.drawable.ic_ticket),
                    contentDescription = "Ícone de cupom"
                )
                Text(
                    text = "${market.coupons} cupons disponíveis",
                    color = Gray500,
                    style = Typography.labelMedium
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    tint = Gray500,
                    painter = painterResource(id = R.drawable.ic_map_pin),
                    contentDescription = "Ícone de localização"
                )
                Text(
                    text = market.address,
                    color = Gray500,
                    style = Typography.labelMedium
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    tint = Gray500,
                    painter = painterResource(id = R.drawable.ic_phone),
                    contentDescription = "Ícone de telefone"
                )
                Text(
                    text = market.phone,
                    color = Gray500,
                    style = Typography.labelMedium
                )
            }
        }
    }
}

@Preview
@Composable
private fun MarketDetailsInfoPreview() {
    MarketDetailsInfos(market = mockMarkets.first())
}
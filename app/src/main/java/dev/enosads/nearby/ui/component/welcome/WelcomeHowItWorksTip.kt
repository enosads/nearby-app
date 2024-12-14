package dev.enosads.nearby.ui.component.welcome

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.enosads.nearby.R
import dev.enosads.nearby.ui.theme.Gray500
import dev.enosads.nearby.ui.theme.RedBase
import dev.enosads.nearby.ui.theme.Typography

@Composable
fun WelcomeHowItWorksTip(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    @DrawableRes iconRes: Int
) {
    Row(modifier = modifier, horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        Icon(
            modifier = Modifier.size(32.dp),
            painter = painterResource(iconRes),
            tint = RedBase,
            contentDescription = "Ícone de como funciona"
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = title, style = Typography.headlineSmall)
            Text(text = subtitle, style = Typography.bodySmall, color = Gray500)
        }
    }
}

@Preview
@Composable
private fun WelcomeHowItWorksTipPreview() {
    WelcomeHowItWorksTip(
        modifier = Modifier.fillMaxWidth(),
        title = "Encontre estabelecimentos",
        subtitle = "Veja locais perto de você que são parceiros Nearby",
        iconRes = R.drawable.ic_map_pin
    )
}
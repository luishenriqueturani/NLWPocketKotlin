package com.example.nerby.ui.components.market_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.nerby.R
import com.example.nerby.data.model.Market
import com.example.nerby.ui.theme.Gray400
import com.example.nerby.ui.theme.Gray500
import com.example.nerby.ui.theme.Typography

@Composable
fun NearbyMarketDetails(
  modifier: Modifier = Modifier,
  market: Market
) {
  Column (
    modifier = modifier,
    verticalArrangement = Arrangement.spacedBy(16.dp)
  ) {
    Text(text = "Informações", style = Typography.headlineSmall, color = Gray400)

    Column (
      verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
      Row (
        horizontalArrangement = Arrangement.spacedBy(8.dp)
      ) {
        Icon(
          modifier = Modifier.size(16.dp),
          painter = painterResource(id = R.drawable.ic_tools_kitchen_2),
          contentDescription = "Ícone de cupom",
          tint = Gray500
        )
        Text(text = "${market.coupons} cupons disponíveis", style = Typography.labelMedium, color = Gray500)

      }

      Row (
        horizontalArrangement = Arrangement.spacedBy(8.dp)
      ) {
        Icon(
          modifier = Modifier.size(16.dp),
          painter = painterResource(id = R.drawable.ic_map_pin),
          contentDescription = "Ícone de localização",
          tint = Gray500
        )
        Text(text = market.address, style = Typography.labelMedium, color = Gray500)

      }

      Row (
        horizontalArrangement = Arrangement.spacedBy(8.dp)
      ) {
        Icon(
          modifier = Modifier.size(16.dp),
          painter = painterResource(id = R.drawable.ic_phone),
          contentDescription = "Ícone de telefone",
          tint = Gray500
        )
        Text(text = market.phone, style = Typography.labelMedium, color = Gray500)

      }
    }
  }
}
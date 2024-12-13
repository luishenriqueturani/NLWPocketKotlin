package com.example.nerby.ui.components.market_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nerby.data.model.Rule
import com.example.nerby.ui.theme.Gray400
import com.example.nerby.ui.theme.Gray500
import com.example.nerby.ui.theme.Typography

@Composable
fun NearbyMarketDetailsRules(modifier: Modifier = Modifier, rules: List<Rule>) {
  Column (
    modifier = modifier,
    verticalArrangement = Arrangement.spacedBy(16.dp)
  ) {
    Text(text = "Regulamento", style = Typography.headlineSmall, color = Gray400)

    Text(
      modifier = Modifier.padding(start = 16.dp),
      text = rules.joinToString("\n") { "• ${it.description}" },
      style = Typography.labelMedium,
      lineHeight = 24.sp,
      color = Gray500
    )
  }
}
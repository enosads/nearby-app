package dev.enosads.nearby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import dev.enosads.nearby.data.model.Market
import dev.enosads.nearby.ui.screen.HomeScreen
import dev.enosads.nearby.ui.screen.MarketDetailsScreen
import dev.enosads.nearby.ui.screen.SplashScreen
import dev.enosads.nearby.ui.screen.WelcomeScreen
import dev.enosads.nearby.ui.screen.route.Home
import dev.enosads.nearby.ui.screen.route.Splash
import dev.enosads.nearby.ui.screen.route.Welcome
import dev.enosads.nearby.ui.theme.NearbyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NearbyTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Splash
                ) {
                    composable<Splash> {
                        SplashScreen(
                            modifier = Modifier.fillMaxSize(),
                            onNavigateToWelcome = {
                                navController.navigate(Welcome)
                            },
                        )
                    }
                    composable<Welcome> {
                        WelcomeScreen(
                            onNavigateToHome = {
                                navController.navigate(Home)
                            }
                        )
                    }
                    composable<Home> {
                        HomeScreen(onNavigateToMarketDetails = { selectedMarket ->
                            navController.navigate(selectedMarket)
                        })

                    }
                    composable<Market> {
                        val selectedMarket = it.toRoute<Market>()
                        MarketDetailsScreen(market = selectedMarket, onNavigateBack = {
                            navController.popBackStack()
                        })
                    }
                }
            }
        }
    }
}


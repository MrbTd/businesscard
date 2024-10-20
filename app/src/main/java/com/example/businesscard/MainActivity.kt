import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinesscardTheme
import com.example.businesscard.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 40.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Toure Ben Daouda",
                fontSize = 24.sp,
                color = Color.Black
            )
            Text(
                text = "Dev Mobile",
                fontSize = 18.sp,
                color = Color.Gray
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            ContactInfo(icon = Icons.Default.Phone, info = "+225 (01) 0349 3070")
            ContactInfo(icon = Icons.Default.Email, info = "mrbentouredev@gmail.com")
            ContactInfo(icon = Icons.Default.Email, info = "ben.toure@akiltecknologies.com")
        }
    }
}

@Composable
fun ContactInfo(icon: ImageVector, info: String) {
    Row(
        modifier = Modifier.padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color.Black
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = info, fontSize = 18.sp, color = Color.Black)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinesscardTheme {
        BusinessCard()
    }
}

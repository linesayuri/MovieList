package br.com.movielist

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.movielist.ui.theme.MovieListTheme

class TelaEmAlta : ComponentActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_emalta)

        val btnvoltar : Button = findViewById(R.id.btn_voltar)

        btnvoltar.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


        val btnmovie1 : ImageButton = findViewById(R.id.btn_movie_1)

        btnmovie1.setOnClickListener{
            val intent = Intent(this,TelaMovieDetalhes1::class.java)
            startActivity(intent)
        }

    }
}
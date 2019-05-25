package mario.antolovic.baller.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*
import mario.antolovic.baller.Model.Player
import mario.antolovic.baller.R
import mario.antolovic.baller.Utilities.EXTRA_PLAYER


class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)


        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagues.text = "Looking for ${player.league} ${player.skill} league near you..."

    }
}

package mario.antolovic.baller.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*
import mario.antolovic.baller.R
import mario.antolovic.baller.Utilities.EXTRA_LEAGUE
import mario.antolovic.baller.Utilities.EXTRA_SKILL

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)


        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagues.text = "Looking for $league $skill league near you..."

    }
}

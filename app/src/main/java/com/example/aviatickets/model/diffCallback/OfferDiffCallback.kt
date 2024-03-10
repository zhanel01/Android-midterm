package com.example.aviatickets.model.diffCallback

import androidx.recyclerview.widget.DiffUtil
import com.example.aviatickets.model.entity.Offer

class OfferDiffCallback : DiffUtil.ItemCallback<Offer>()  {
    override fun areItemsTheSame(oldItemPosition:Offer, newItemPosition: Offer): Boolean {
        return oldItemPosition.id == newItemPosition.id
    }

    override fun areContentsTheSame(oldItemPosition: Offer, newItemPosition: Offer): Boolean {
        return oldItemPosition.flight == newItemPosition.flight &&  oldItemPosition.price == newItemPosition.price
    }
}

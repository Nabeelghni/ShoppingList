package com.example.shoppinglist.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add

@Composable
fun ItemInput(text: String, onTextChange: (String) -> Unit, onAddItem: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = onTextChange,
            label = { Text("Add new item") },
            modifier = Modifier.weight(1f),
            shape = RoundedCornerShape(16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Button(
            onClick = onAddItem,
            enabled = text.isNotBlank()
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Add Item")
            Spacer(modifier = Modifier.width(4.dp))
            Text("Add")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemInputPreview() {
    ItemInput(
        text = "Item Name",
        onTextChange = {},
        onAddItem = {}
    )
}

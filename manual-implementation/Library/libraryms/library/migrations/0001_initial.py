# Generated by Django 4.0.4 on 2022-05-22 04:07

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Publication',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('sci_paper_id', models.CharField(db_column='sciPaperId', max_length=300)),
                ('title', models.CharField(max_length=20)),
                ('author', models.CharField(max_length=20)),
            ],
        ),
    ]